function bitToImage(data,id) {
    var arrayBuffer = data;
    var bytes = new Uint8Array(arrayBuffer);

    var image = document.getElementById(id);
    image.src = 'data:image/png;base64,'+encode(bytes);
}

function getProductbyId(id){
	// product
	fetch("/producten/" + id)
	.then(response => response.json())
	.then(function(json){
		bitToImage(json.afbeelding,"myimage");
		document.getElementById("ProductNaam").innerHTML = json.naam;
		document.getElementById("ProductPrijs").innerHTML = json.prijs;
	})
 }
	var url_string = window.location.href;
	var url = new URL(url_string);

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
function createSale(){
if(window.localStorage.getItem("product_id") == null) {
	window.localStorage.setItem("product_id",id);
}
location.href = 'CreatingSales.html';

}
