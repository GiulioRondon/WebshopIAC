function getProductbyId(id){
	// product
	fetch("/producten/" + id)
	.then(response => response.json())
	.then(function(json){
		document.getElementById("myimage").src = json.afbeelding;
		document.getElementById("ProductNaam").innerHTML = json.naam;
		document.getElementById("ProductPrijs").innerHTML = json.prijs;
	})
<<<<<<< HEAD
 }
	var url_string = window.location.href;
	var url = new URL(url_string);
=======
}
 
var url_string = window.location.href;
var url = new URL(url_string);
>>>>>>> 37959cec1452e66c148d23aad4e6ad0249a576ce

var id = url.searchParams.get("id");
	
getProductbyId(id);

function addToCart() {
	if(window.localStorage.getItem("cart_items") == null) {
		window.localStorage.setItem("cart_items", JSON.stringify(Array()))
	}
	var itemArray = JSON.parse(window.localStorage.getItem("cart_items"));
	itemArray.push(Array(id,document.getElementById("sizeSelect").value));
	window.localStorage.setItem("cart_items", JSON.stringify(itemArray));
	location.href = 'cart.html';
}