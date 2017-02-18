$(function(){

  var fContainer = $('#users-info');
var friend;


$('#txt').keyup(function(){
  var searchValReg = $(this).val(),
      searchVal = RegExp(searchValReg,"gi");
      fContainer.html(' ');
      var xhr = new XMLHttpRequest();
      xhr.open('Get','https://azadar-hussain.github.io/codes/orders/students.json',true);
      xhr.onload = function(){
            data = JSON.parse(xhr.responseText);
            console.log(data)
            $.each(data,function(i,friend){
              if(searchValReg === ''){
      console.log("hello")
              }else if(friend.name.match(searchVal)){
                fContainer.append('<div class="user"><img src="'+ friend.imgurl +'"><div class="user-info"><h1>'+friend.name+'</h1><p>'+friend.relation+'</p></div></div>');
              }

            });
      }
      xhr.send();


});





$('#btn').click(function(){
  var friend = { name : $('#name').val(),
      relation : $("#relation").val(),
      imgurl : $('#imgurl').val()
    }

var xhr = new XMLHttpRequest();
xhr.open('POST','https://azadar-hussain.github.io/codes/orders/students.json',true);
  xhr.onload = function(){
    data = JSON.parse(xhr.responseText +friend);

  }

  xhr.send();

    console.log(friend)

  });






});
