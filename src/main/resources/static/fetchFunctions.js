function getProducten() {
	fetch("/producten")
    .then(response => response.json())
    .then(function(jsonArray) {
    		document.getElementById("products").innerHTML = "";
            for (var i = 0; i < jsonArray.length; i++)
            {
            	document.getElementById("products").innerHTML += "<a href='Shirtone.html'><span class='explain'><img src='"+jsonArray[i].afbeelding+"' alt='"+jsonArray[i].afbeelding+"' width='400px'></span></a>"
    			console.log(jsonArray[i].naam);
            }
 })
}
getProducten();