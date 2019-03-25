document.getElementById("accountButton").addEventListener("click",function() {
	var accountJson = {
			"email": document.getElementById("emailForm").value,
			"password": document.getElementById("passwordForm").value
	};

		var fetchoptions = { 
				method: 'POST',
				headers: {
					'Accept': 'application/json',
					'Content-Type': 'application/json'
				},
   			  	body:  JSON.stringify(accountJson),
   			}
   			fetch("accounts/create", fetchoptions)
   			  .then(function(response) {
   			    if (response.ok) {
   			      console.log("Account made!");
   			    } else console.log("Could not make account!");
   			     
   			  })
   			  .catch(error => console.log(error));
		  
});