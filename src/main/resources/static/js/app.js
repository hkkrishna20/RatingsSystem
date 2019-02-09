var PRODUCT_APP={
                       
 getProductDetails : function(){
  var ajaxRequest=$.ajax("mydata.json");
  return ajaxRequest.promise();
 },
 
 handleCallback : function(){
  var promise = PRODUCT_APP.getProductDetails();
  promise.done(function(data){
   PRODUCT_APP.doProductRendering(data);
  });
 },
 
 doProductRendering: function(data){
  var productContainer =$('.ts-product-container'),
   aProductTemplate = $('#aProductTemplate').tmpl( data );
  productContainer.html(aProductTemplate);
 }
};

$(document).ready(function(){
 PRODUCT_APP.handleCallback();
});