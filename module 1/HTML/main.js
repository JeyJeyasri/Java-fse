document.addEventListener("DOMContentLoaded", function () {
  const registerButtons = document.querySelectorAll(".register-btn");
  const eventInput = document.getElementById("event");
  const registrationForm = document.getElementById("registrationForm");

  registerButtons.forEach(button => {
    button.addEventListener("click", function () {
      const eventName = this.getAttribute("data-event");
      eventInput.value = eventName;

      const modal = new bootstrap.Modal(document.getElementById("registerModal"));
      modal.show();
    });
  });

  registrationForm.addEventListener("submit", function (e) {
    e.preventDefault();
    alert("Submitted Successfully!");

    const modalInstance = bootstrap.Modal.getInstance(document.getElementById("registerModal"));
    modalInstance.hide();
    registrationForm.reset();
  });
});
