document.getElementById("pay").addEventListener("click",function() {
	var adresJson = {
			"straat":document.getElementById("streetForm").value,
			"huisnummer":document.getElementById("huisnumberForm").value,
			"woonplaats":document.getElementById("cityForm").value,
			"postcode":document.getElementById("zipcodeForm").value	
			
	};
		var fetchoptions = { 
				method: 'POST',
				headers: {
					'Accept': 'application/json',
					'Content-Type': 'application/json'
				},
   			  	body:  JSON.stringify(adresJson),
   			}
		  console.log(adresJson);
   			fetch("adressen/create", fetchoptions)
   			  .then(function(response) {
   			    if (response.ok) {
   			      console.log("Adres made!");
   			      console.log(adresJson);
   			    } else console.log("Adres not made!");
   			     
   			  })
   			  .catch(error => console.log(error));
		 
//		var klantJson = {
//				"voornaam":document.getElementById("straatForm").value,
//				"achternaam":document.getElementById("huisnummerForm").value,

//		};
//			var fetchoptions = { 
//					method: 'POST',
//					headers: {
//						'Accept': 'application/json',
//						'Content-Type': 'application/json'
//					},
//	   			  	body:  JSON.stringify(klantJson),
//	   			}
//	   			fetch("adressen/create", fetchoptions)
//	   			  .then(function(response) {
//	   			    if (response.ok) {
//	   			      console.log("Adres made!");
//	   			    } else console.log("Adres not made!");
//	   			     
//	   			  })
//	   			  .catch(error => console.log(error));
			 
});