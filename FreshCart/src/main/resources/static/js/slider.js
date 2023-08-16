$(document).ready(function()
{
  $('.homeslider').slick({
  slidesToShow: 6,
  slidesToScroll: 1,
  autoplay: true,
  autoplaySpeed: 2000,
  prevArrow:'<span class="priv_arr fs-4"><i class="fa fa-angle-left" aria-hidden="true"></i></span>',
  nextArrow:'<span class="next_arr fs-4"><i class="fa fa-angle-right" aria-hidden="true"></i></span>',
  
});
})