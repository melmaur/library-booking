const API_URL = 'http://localhost:8080/api/bookings';

// Load all bookings on page load
window.onload = function() {
    loadBookings();
};

// Fetch and display all bookings
async function loadBookings() {
    try {
        const response = await fetch(API_URL);
        const bookings = await response.json();
        const tbody = document.getElementById('bookingsTable');

        if (bookings.length === 0) {
            tbody.innerHTML = '<tr><td colspan="7" style="text-align:center">No bookings found</td></tr>';
            return;
        }

        tbody.innerHTML = bookings.map(b => `
            <tr>
                <td>${b.id}</td>
                <td>${b.bookTitle}</td>
                <td>${b.borrowerName}</td>
                <td>${b.startDate}</td>
                <td>${b.endDate}</td>
                <td>
                    <span class="${b.active ? 'badge-active' : 'badge-cancelled'}">
                        ${b.active ? 'Active' : 'Cancelled'}
                    </span>
                </td>
                <td>
                    ${b.active ? `<button class="btn-danger"
                    onclick="cancelBooking(${b.id})">Cancel</button>` : '—'}
                </td>
            </tr>
        `).join('');

    } catch (error) {
        showMessage('Error loading bookings', 'error');
    }
}

// Create a new booking
async function createBooking() {
    const bookTitle    = document.getElementById('bookTitle').value;
    const borrowerName = document.getElementById('borrowerName').value;
    const startDate    = document.getElementById('startDate').value;
    const endDate      = document.getElementById('endDate').value;

    if (!bookTitle || !borrowerName || !startDate || !endDate) {
        showMessage('Please fill in all fields', 'error');
        return;
    }

    try {
        const response = await fetch(API_URL, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ bookTitle, borrowerName, startDate, endDate, active: true })
        });

        if (response.ok) {
            showMessage('Booking created successfully!', 'success');
            clearForm();
            loadBookings();
        }
    } catch (error) {
        showMessage('Error creating booking', 'error');
    }
}

// Cancel a booking
async function cancelBooking(id) {
    try {
        const response = await fetch(`${API_URL}/${id}/cancel`, {
            method: 'PUT'
        });

        if (response.ok) {
            showMessage('Booking cancelled successfully!', 'success');
            loadBookings();
        }
    } catch (error) {
        showMessage('Error cancelling booking', 'error');
    }
}

// Show message
function showMessage(text, type) {
    const msg = document.getElementById('message');
    msg.textContent = text;
    msg.className = `message ${type}`;
    setTimeout(() => { msg.className = 'message'; }, 3000);
}

// Clear form
function clearForm() {
    document.getElementById('bookTitle').value = '';
    document.getElementById('borrowerName').value = '';
    document.getElementById('startDate').value = '';
    document.getElementById('endDate').value = '';
}