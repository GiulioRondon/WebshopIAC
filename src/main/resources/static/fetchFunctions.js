function bitToImage(data,id) {
    var arrayBuffer = data;
    var bytes = new Uint8Array(arrayBuffer);

    var image = document.getElementById(id);
    image.src = 'data:image/png;base64,'+encode(bytes);
}

function getProducten() {
	fetch("/producten")
    .then(response => response.json())
    .then(function(jsonArray) {
    		document.getElementById("products").innerHTML = "";
            for (var i = 0; i < jsonArray.length; i++)
            {
            	//de href in de a tag moet een link worden met een pathparameter die het id van het product moet zijn (jsonArray[i].productid)
            	document.getElementById("products").innerHTML += "<a href='ProductPagina.html?id="+jsonArray[i].productID+"'><span class='explain'><img id='"+"img"+jsonArray[i].productID+"' width='400px'></span></a>"
            	bitToImage(jsonArray[i].afbeelding,"img"+jsonArray[i].productID)
            }
 })
}
getProducten();



