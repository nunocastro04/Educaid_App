document.addEventListener("DOMContentLoaded", function() {
    const stars = document.querySelectorAll('.star');
    const ratingDisplay = document.getElementById('rating-number');

    let ratingValue = 0; // Initial rating value

    // Function to update the rating display and stars
    function updateRating(rating) {
        // Round to one decimal point
        rating = Math.round(rating * 2) / 2;

        // Update stars
        stars.forEach(star => {
            const value = parseInt(star.getAttribute('data-value'));
            if (value <= rating) {
                star.classList.add('selected');
            } else {
                star.classList.remove('selected');
            }
        });

        // Update rating display
        ratingDisplay.textContent = rating;
    }

    // Mouse hover effect (for selecting stars)
    stars.forEach(star => {
        star.addEventListener('mouseover', function() {
            const value = parseInt(star.getAttribute('data-value'));
            updateRating(value);
        });

        star.addEventListener('mouseout', function() {
            updateRating(ratingValue);
        });

        // Click to set the rating
        star.addEventListener('click', function() {
            ratingValue = parseInt(star.getAttribute('data-value'));
            updateRating(ratingValue);
        });
    });

    // Initialize with the current rating
    updateRating(ratingValue);
});