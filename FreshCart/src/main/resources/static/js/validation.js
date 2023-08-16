 <script>
        let user = document.getElementById("username");
        let lastname = document.getElementById("last_name");
        let flag = 1;
        function valid(){
         if(user.value == "")
         {
          document.getElementById("error").innerHTML="user name is empty";
          flag=0;
         }
         else if(user.value.length<5)
         {
          document.getElementById("error").innerHTML="user name atleast 5 character";
          flag=0;
         }
         else
         {
          document.getElementById("error").innerHTML="";
          flag=1;
         }

         if(lastname.value == "")
         {
          document.getElementById("error1").innerHTML="last name is empty";
          flag=0;
         }
         else if(lastname.value.length<5)
         {
          document.getElementById("error1").innerHTML="last name atleast 5 character";
          flag=0;
         }
         else
         {
          document.getElementById("error1").innerHTML="";
          flag=1;
         }

         if(flag)
         {
           return true;
         }
         else
         {
          return false;
         }

        }
      </script>