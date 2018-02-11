  $(document).ready(function () {
            	
	           alert("HIIIIIIIIIIIIIIIIIIIII");
                var populationDataArray = [];
              // $("#btnSubmit").button().click(function(){
               $.getJSON("#highChart.action", function (data) {
          
                	
                	  alert("HIIIIIIIIIIIIIIIIIIIII222222222222222222222");
                	
                    $.each(data.listUserEntity, function (index) {
                    	
                        populationDataArray[index] = ['' + this.stateName + '', this.statePopulation];
                        
                    });

                    var chart = {
                        plotBackgroundColor: null,
                        plotBorderWidth: null,
                        plotShadow: false
                    };

                    var title = {
                        text: 'State Population Report (Pie Chart)'
                    };

                    var tooltip = {
                        pointFormat: '{series.name}: <b>{point.y}</b>'
                    };

                    var plotOptions = {
                        pie: {
                            allowPointSelect: true,
                            cursor: 'pointer',
                            dataLabels: {
                                enabled: true,
                                format: '<b>{point.name}</b>: {point.y}',
                                style: {
                                    fontSize: 10,
                                    color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                                }
                            }
                        }
                    };

                    var series = [{
                            type: 'pie',
                            name: 'State Population',
                            data: populationDataArray
                        }];

                    var json = {};
                    json.chart = chart;
                    json.title = title;
                    json.tooltip = tooltip;
                    json.series = series;
                    json.plotOptions = plotOptions;
                    $('#population').highcharts(json);
                });
               
            //});
  });