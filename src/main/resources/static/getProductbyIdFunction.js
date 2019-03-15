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
	var itemArray = JSON.parse(window.localStorage.getItem("cart_items"));
	itemArray.push(id);
	window.localStorage.setItem("cart_items", JSON.stringify(itemArray));
	location.href = 'cart.html';
}