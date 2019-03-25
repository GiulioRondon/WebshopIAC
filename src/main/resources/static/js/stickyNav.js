         window.onscroll = function() {stickyNav()};

         var navbar = document.getElementById("navbar");

         var sticky = navbar.offsetTop;

         function stickyNav() {
           if (window.pageYOffset >= sticky) {
             navbar.classList.add("sticky")
             navbar.style.position = "fixed";
             navbar.style.top = 0;
           } else {
           	 navbar.style.position = "absolute";
             navbar.classList.remove("sticky");
             navbar.style.top = "400px";
           }
         }