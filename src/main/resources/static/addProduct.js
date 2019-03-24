var imageBase64;
function readFile(file) {
	var input = file;
	var output = "";
	
	if (input.files.length === 0) {
	    return;
	}
    
    var fr1 = new FileReader();
    
    fr1.onload = function (e) {
        var image = document.createElement("IMG");
        image.src = e.target.result;
        image.onload = function() {
            var canvas = document.createElement("canvas");
            canvas.width = 100;
            canvas.height = 100;
        	canvas.getContext("2d").drawImage(image, 0, 0,100,100);
        	var canvasIn = canvas;

        	var fr = new FileReader();
        	
        	fr.onload = function () {
        		console.log("result--------------------");
        		console.log(fr.result);
        		console.log("result--------------------");
        	    imageBase64 = new Int8Array(fr.result);
        	};
        	var blob = dataURItoBlob(canvasIn.toDataURL('image/jpeg'));
        	fr.readAsArrayBuffer(blob);
        	
        	}
        }
    fr1.readAsDataURL(input.files[0]);
};

function dataURItoBlob(dataURI) {
	  var byteString;
	  if (dataURI.split(',')[0].indexOf('base64') >= 0)
	    byteString = atob(dataURI.split(',')[1]);
	  else
	    byteString = unescape(dataURI.split(',')[1]);

	  var mimeString = dataURI.split(',')[0].split(':')[1].split(';')[0];

	  var ia = new Uint8Array(byteString.length);
	  for (var i = 0; i < byteString.length; i++) {
	    ia[i] = byteString.charCodeAt(i);
	  }

	  return new Blob([ia], {
	    type: mimeString
	  });
}

document.getElementById("AddProductButton").addEventListener("click",function() {
	readFile(document.getElementById("pictureInput"));
	window.setTimeout(function() {
	 	console.log(imageBase64);
	 	base64String = JSON.stringify(imageBase64)
	 	
		var productJson = {
				"naam": document.getElementById("nameInput").value,
				"prijs": document.getElementById("priceInput").value,
				"beschrijving": document.getElementById("descriptionInput").value,
				"afbeelding": base64String
		};
		console.log(productJson);
		var jsonString = JSON.stringify(productJson);
		console.log(jsonString);

			var fetchoptions = { 
					method: 'POST',
					headers: {
						'Accept': 'application/json',
						'Content-Type': 'application/json'
					},
	   			  	body: jsonString ,
	   			}
	   			fetch("producten/create", fetchoptions)
	   			  .then(function(response) {
	   			    if (response.ok) {
	   			      console.log("Product made!");
	   			    } else console.log("Could not make product!");
	   			     
	   			  })
	   			  .catch(error => console.log(error));
	},500);	  
});