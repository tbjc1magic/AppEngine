<!DOCTYPE html>
{% autoescape true %}
<html>
  <head>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css"  href="/stylesheets/DataIncubator.css">
    <script type="text/javascript"src="/stylesheets/DataIncubator.js"> </script>
  </head>

  <body>
    <script src="https://code.highcharts.com/highcharts.js"></script>
    <script src="https://code.highcharts.com/modules/exporting.js"></script>
    <div>
    <figure>
    <div id="highcharts2" style="min-width: 310px; height: 400px; max-width: 650px; margin: 0 auto"></div>
    <figcaption>Fig. 1. This figure shows the percentage of drafted(blue) and all prospective players(black) in all positions. All of positions relatively have the same drafting percentage (drafted/prospective)</figcaption>
    </figure>
    </div>

    <div>
    <figure>
    <div id="highcharts1" style="min-width: 310px; height: 400px; max-width: 650px; margin: 0 auto"></div>
    <figcaption>Fig. 1. This figure shows the percentage of drafted(blue) and all prospective players(black) in all positions. All of positions relatively have the same drafting percentage (drafted/prospective)</figcaption>
    </figure>
    </div>
    </body>
</html>
{% endautoescape %}
