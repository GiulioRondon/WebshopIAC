document.getElementById("pay").addEventListener("click",function() {
	var today = new Date();
	var orderJson = {
			"email": document.getElementById("emailForm").value,
			"voornaam":document.getElementById("firstnameForm").value,
			"achternaam":document.getElementById("lastnameForm").value,
			"afleveradres":document.getElementById("adressForm").value,
			"woonplaats":document.getElementById("cityForm").value,
			"postcode":document.getElementById("zipcodeForm").value
				
	};
		var fetchoptions = { 
				method: 'POST',
				headers: {
					'Accept': 'application/json',
					'Content-Type': 'application/json'
				},
   			  	body:  JSON.stringify(orderJson),
   			}
   			fetch("bestellingen/create", fetchoptions)
   			  .then(function(response) {
   			    if (response.ok) {
   			      console.log("Order made!");
   			    } else console.log("Order not made!");
   			     
   			  })
   			  .catch(error => console.log(error));
		  
});