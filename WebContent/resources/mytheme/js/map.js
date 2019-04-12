var infowindow = null;
$(document).ready(function () { initialize(); });
 
function initialize() {
 
var centerMap = new google.maps.LatLng(39.828175, -98.5795);
 
var myOptions = {
zoom: 4,
center: centerMap,
mapTypeId: google.maps.MapTypeId.ROADMAP
}
 
var map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);
 
setMarkers(map, sites);
infowindow = new google.maps.InfoWindow({
content: "loading..."
});
 
//var bikeLayer = new google.maps.BicyclingLayer();
//bikeLayer.setMap(map);
}
 
var sites = [
['Mount Evans', 39.58108, -105.63535, 4, 'This is Mount Evans.'],
['Irving Homestead', 40.315939, -105.440630, 2, 'This is the Irving Homestead.'],
['Badlands National Park', 43.785890, -101.90175, 1, 'This is Badlands National Park'],
['Flatirons in the Spring', 39.99948, -105.28370, 3, 'These are the Flatirons in the spring.']
];
 
function setMarkers(map, markers) {
 
for (var i = 0; i < markers.length; i++) {
var sites = markers[i];
var siteLatLng = new google.maps.LatLng(sites[1], sites[2]);
var marker = new google.maps.Marker({
position: siteLatLng,
map: map,
title: sites[0],
zIndex: sites[3],
html: sites[4]
});
 
var contentString = "Some content";
 
google.maps.event.addListener(marker, "click", function () {
infowindow.setContent(this.html);
infowindow.open(map, this);
});
}
}