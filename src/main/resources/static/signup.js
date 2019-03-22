console.log("Hallo");
document.getElementById("accountAanmaken").addEventListener("click",function() {
	console.log("Ik kom in de functie");
		  var formData = new FormData(document.querySelector("#postAccountForm"));
		  var encData = new URLSearchParams(formData.entries());

		  var fetchoptions = { 
   			  method: 'POST',
   			  body:  encData,
   			}
   			fetch("/accounts", fetchoptions)
   			  .then(function(response) {
   			    if (response.ok) {
   			      console.log("Account made!");
   			    } else console.log("Could not make account!");
   			     
   			  })
   			  .catch(error => console.log(error));
		  
});
