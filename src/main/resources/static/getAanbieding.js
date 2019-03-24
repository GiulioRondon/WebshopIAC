function getProductbyId(id){
	fetch("/aanbiedingen/byproduct/" + id)
	.then(response => response.json())
	.then(function(json){
		document.getElementById("ProductAanbieding").innerHTML = "€" + json.prijs;
	})
 }

var url_string = window.location.href;
var url = new URL(url_string);
var id = url.searchParams.get("id");
getProductbyId(id);