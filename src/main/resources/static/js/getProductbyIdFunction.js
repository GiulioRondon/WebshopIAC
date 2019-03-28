var url_string = window.location.href;
var url = new URL(url_string);

var id = url.searchParams.get("id");

function bitToImage(data,id) {
    var arrayBuffer = data.split(",");
    
    var bytes = new Uint16Array(arrayBuffer);
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
	window.localStorage.setItem("product_id",id);

	location.href = 'CreatingSales.html';

}

function encode (input) {
    var keyStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
    var output = "";
    var chr1, chr2, chr3, enc1, enc2, enc3, enc4;
    var i = 0;

    while (i < input.length) {
        chr1 = input[i++];
        chr2 = i < input.length ? input[i++] : Number.NaN; // Not sure if the index 
        chr3 = i < input.length ? input[i++] : Number.NaN; // checks are needed here

        enc1 = chr1 >> 2;
        enc2 = ((chr1 & 3) << 4) | (chr2 >> 4);
        enc3 = ((chr2 & 15) << 2) | (chr3 >> 6);
        enc4 = chr3 & 63;

        if (isNaN(chr2)) {
            enc3 = enc4 = 64;
        } else if (isNaN(chr3)) {
            enc4 = 64;
        }
        output += keyStr.charAt(enc1) + keyStr.charAt(enc2) +
                  keyStr.charAt(enc3) + keyStr.charAt(enc4);
    }
    return output;
}

function deleteProduct() {
	var fetchoptions = { 
			method: 'DELETE'
	}
	
fetch("/producten/" + id, fetchoptions)
	.then(response => response.json())
	.then(function(json){
		location.href = '/index.html';
	})
}

