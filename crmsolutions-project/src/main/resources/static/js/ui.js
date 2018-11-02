// INTERFACE
var navCollapse = document.querySelector(".navbar-collapse");
var navToggle = document.querySelector(".navbar-toggle");
var chatId = document.querySelector(".username-page-container");

navToggle.addEventListener('click', function(){
  setTimeout(function(){
    navCollapse.classList.toggle("navbar-collapse-color");
    chatId.classList.toggle("pushChat");
  }, 200);
});
