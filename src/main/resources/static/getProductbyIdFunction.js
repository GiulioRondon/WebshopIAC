function getProductbyId(id){
	// product
	fetch("/producten/" + id)
	.then(response => response.json())
	.then(function(json){
		document.getElementById("myimage").src = json.afbeelding;
		document.getElementById("ProductNaam").innerHTML = json.naam;
		document.getElementById("ProductPrijs").innerHTML = json.prijs;
	})
}
 
var url_string = window.location.href;
var url = new URL(url_string);

var id = url.searchParams.get("id");
	
getProductbyId(id);

function addToCart() {
	var itemArray = Array(window.localStorage.getItem("cart_items"));
	itemArray.push(id);
	window.localStorage.setItem("cart_items", itemArray)
	console.log(itemArray);
}