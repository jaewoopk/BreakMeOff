document.addEventListener("DOMContentLoaded", function() {
    const delayedElements = document.querySelectorAll('[data-delay]');

    delayedElements.forEach((element) => {
        const delay = element.getAttribute('data-delay');
        setTimeout(() => {
            element.classList.add('active');
        }, delay);
    });
});
