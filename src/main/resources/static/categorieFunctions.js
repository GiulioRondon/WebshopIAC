function getCategories() {
	fetch("/categories")
    .then(response => response.json())
    .then(function(jsonArray) {
            for (var i = 0; i < jsonArray.length; i++)
            {
            	document.getElementById("categories").innerHTML += "<a href='/categoriepage.html?id="+jsonArray[i].categorieID+"' id='categorieBox'><h2>"+jsonArray[i].naam+"</h2></a>"
            }
 })
}
getCategories();