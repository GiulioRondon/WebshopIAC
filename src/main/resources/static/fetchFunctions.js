function bitToImage(data,id) {
    var arrayBuffer = data.split(",");
    
    var bytes = new Uint16Array(arrayBuffer);
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
            	if (jsonArray[i].afbeelding != null) {
            		bitToImage(jsonArray[i].afbeelding,"img"+jsonArray[i].productID);
            	}
            }
 })
}
getProducten();

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

