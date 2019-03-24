document.getElementById("saleButton").addEventListener("click",function() {
	var product = localStorage.getItem('product_id')
	var saleJson = {
			"prijs": document.getElementById("prijsForm").value,
			"beginDatum":document.getElementById("beginDatumForm").value,
			"eindDatum":document.getElementById("eindDatumForm").value,
			"product_ID":product
	};
console.log(product);
		var fetchoptions = { 
				method: 'POST',
				headers: {
					'Accept': 'application/json',
					'Content-Type': 'application/json'
				},
   			  	body:  JSON.stringify(saleJson),
   			}
   			fetch("aanbiedingen/create", fetchoptions)
   			  .then(function(response) {
   			    if (response.ok) {
   			      console.log("Aanbieding made!");
   			    } else console.log("Could not make aanbieding!");
   			     
   			  })
   			  .catch(error => console.log(error));
		  
});