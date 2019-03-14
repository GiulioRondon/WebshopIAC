function getProducten() {
	fetch("/producten")
    .then(response => response.json())
    .then(function(jsonArray) {
    		document.getElementById("products").innerHTML = "";
            for (var i = 0; i < jsonArray.length; i++)
            {
            	//de href in de a tag moet een link worden met een pathparameter die het id van het product moet zijn (jsonArray[i].productid)
            	console.log(jsonArray);
            	document.getElementById("products").innerHTML += "<a href='ProductPage.html?id="+jsonArray[i].productID"'><span class='explain'><img src='"+jsonArray[i].afbeelding+"' alt='"+jsonArray[i].afbeelding+"' width='400px'></span></a>"
    			console.log(jsonArray[i].naam);
            }
 })
}
getProducten();



