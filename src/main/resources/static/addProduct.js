document.getElementById("AddProductButton").addEventListener("click",function() {
	var productJson = {
			"naam": document.getElementById("nameInput").value,
			"prijs": document.getElementById("priceInput").value,
			"beschrijving": document.getElementById("descriptionInput").value,
			"afbeelding": document.getElementById("pictureInput").value
	};

		var fetchoptions = { 
				method: 'POST',
				headers: {
					'Accept': 'application/json',
					'Content-Type': 'application/json'
				},
   			  	body:  JSON.stringify(productJson),
   			}
   			fetch("producten/create", fetchoptions)
   			  .then(function(response) {
   			    if (response.ok) {
   			      console.log("Product made!");
   			    } else console.log("Could not make product!");
   			     
   			  })
   			  .catch(error => console.log(error));
		  
});