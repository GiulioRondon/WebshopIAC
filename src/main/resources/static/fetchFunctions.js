function getProducten() {
	fetch("/producten")
    .then(response => response.json())
    .then(function(jsonArray) {
    		document.getElementById("products").innerHTML = "";
            for (var i = 0; i < jsonArray.length; i++)
            {
            	document.getElementById("products").innerHTML += "<a href='Shirtone.html'><span class='explain'><p>"+jsonArray[i].naam+"</p><img src='one.jpeg' alt='one'></span></a>"
    			console.log(jsonArray[i].naam);
            }
 })
}
getProducten();