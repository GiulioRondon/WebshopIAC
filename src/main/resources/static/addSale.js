document.getElementById("saleButton").addEventListener("click",function() {
	var product = localStorage.getItem('product_id');
	var saleJson = {
			"prijs": Number(document.getElementById("prijsForm").value),
			"beginDatum":document.getElementById("beginDatumForm").value,
			"eindDatum":document.getElementById("eindDatumForm").value,
			"productId":product
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
		console.log(fetchoptions);
   			fetch("aanbiedingen/create", fetchoptions)
   			  .then(function(response) {
   			    if (response.ok) {
   			      console.log("Aanbieding made!");
   			    } else console.log("Could not make aanbieding!");
   			     
   			  })
   			  .catch(error => console.log(error));
   	location.href = "/ProductPagina.html?id="+product;
		  
});