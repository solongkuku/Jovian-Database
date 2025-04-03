import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class AlienSpeciesPopulationCharts extends Application {
    
    @Override
    public void start(Stage stage) {
        stage.setTitle("Alien Species Population Growth Charts");
        
        // Create a container for all charts
        VBox chartsContainer = new VBox(10);
        
        // Add each species chart
        chartsContainer.getChildren().add(createZortianChart());
        chartsContainer.getChildren().add(createAquarianChart());
        chartsContainer.getChildren().add(createVolariansChart());
        chartsContainer.getChildren().add(createTerraformisChart());
        chartsContainer.getChildren().add(createMechanoformsChart());
        chartsContainer.getChildren().add(createLuminariChart());
        chartsContainer.getChildren().add(createGravititesChart());
        chartsContainer.getChildren().add(createNebulitesChart());
        chartsContainer.getChildren().add(createChronosChart());
        chartsContainer.getChildren().add(createSymbiontsChart());
        
        // Create a scroll pane to contain all charts
        ScrollPane scrollPane = new ScrollPane(chartsContainer);
        scrollPane.setFitToWidth(true);
        
        // Create scene and display
        Scene scene = new Scene(scrollPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }
    
    private VBox createZortianChart() {
        VBox container = new VBox(5);
        container.getChildren().add(new Label("Zortian Population Growth"));
        
        // Define axes
        NumberAxis xAxis = new NumberAxis(0, 1000, 100);
        NumberAxis yAxis = new NumberAxis(0, 10, 1);
        xAxis.setLabel("Years");
        yAxis.setLabel("Population (billions)");
        
        // Create chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Zortian Population Growth (0.5% annual growth)");
        
        // Add data
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Population");
        
        // Calculate population growth with 0.5% annual increase
        double population = 5.0; // Starting at 5 billion
        for (int year = 0; year <= 1000; year += 50) {
            // Implement plateaus during resource scarcity (around years 300-350 and 700-750)
            if ((year >= 300 && year <= 350) || (year >= 700 && year <= 750)) {
                series.getData().add(new XYChart.Data<>(year, population));
            } else {
                population *= Math.pow(1.005, 50); // Compound growth for 50 years
                series.getData().add(new XYChart.Data<>(year, population));
            }
        }
        
        lineChart.getData().add(series);
        lineChart.setPrefHeight(300);
        container.getChildren().add(lineChart);
        
        return container;
    }
    
    private VBox createAquarianChart() {
        VBox container = new VBox(5);
        container.getChildren().add(new Label("Aquarian Population Growth"));
        
        // Define axes
        NumberAxis xAxis = new NumberAxis(0, 600, 50);
        NumberAxis yAxis = new NumberAxis(0, 15, 1);
        xAxis.setLabel("Years");
        yAxis.setLabel("Population (billions)");
        
        // Create chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Aquarian Population Growth (2.1% growth with cyclical crashes)");
        
        // Add data
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Population");
        
        // Calculate population growth with cyclical crashes every 300 years
        double population = 3.0; // Starting at 3 billion
        for (int year = 0; year <= 600; year += 10) {
            // Implement population crashes at 300 and 600 years
            if (year == 300 || year == 600) {
                population *= 0.4; // 60% population crash
            } else {
                population *= Math.pow(1.021, 10); // Compound growth for 10 years
            }
            series.getData().add(new XYChart.Data<>(year, population));
        }
        
        lineChart.getData().add(series);
        lineChart.setPrefHeight(300);
        container.getChildren().add(lineChart);
        
        return container;
    }
    
    private VBox createVolariansChart() {
        VBox container = new VBox(5);
        container.getChildren().add(new Label("Volarian Population Growth"));
        
        // Define axes
        NumberAxis xAxis = new NumberAxis(0, 500, 50);
        NumberAxis yAxis = new NumberAxis(0, 15, 1);
        xAxis.setLabel("Years");
        yAxis.setLabel("Population (billions)");
        
        // Create chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Volarian Population Growth (1.2% annual with fluctuations)");
        
        // Add data
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Population");
        
        // Calculate population growth with seasonal fluctuations
        double population = 6.0; // Starting at 6 billion
        for (int year = 0; year <= 500; year += 5) {
            // Add seasonal fluctuations
            double fluctuation = Math.sin(year * 0.1) * 0.3 + 1.0;
            population *= Math.pow(1.012, 5) * fluctuation; // Compound growth with fluctuation
            series.getData().add(new XYChart.Data<>(year, population));
        }
        
        lineChart.getData().add(series);
        lineChart.setPrefHeight(300);
        container.getChildren().add(lineChart);
        
        return container;
    }
    
    private VBox createTerraformisChart() {
        VBox container = new VBox(5);
        container.getChildren().add(new Label("Terraformis Population Growth"));
        
        // Define axes
        NumberAxis xAxis = new NumberAxis(0, 5000, 500);
        NumberAxis yAxis = new NumberAxis(0, 3, 0.2);
        xAxis.setLabel("Years");
        yAxis.setLabel("Population (billions)");
        
        // Create chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Terraformis Population Growth (0.1% annual with rainfall boosts)");
        
        // Add data
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Population");
        
        // Calculate population growth with rainfall boosts
        double population = 0.5; // Starting at 0.5 billion
        for (int year = 0; year <= 5000; year += 100) {
            // Add rainfall boosts every 1000 years
            if (year % 1000 == 0 && year > 0) {
                population *= 1.2; // 20% boost after major rainfall
            } else {
                population *= Math.pow(1.001, 100); // Compound growth for 100 years
            }
            series.getData().add(new XYChart.Data<>(year, population));
        }
        
        lineChart.getData().add(series);
        lineChart.setPrefHeight(300);
        container.getChildren().add(lineChart);
        
        return container;
    }
    
    private VBox createMechanoformsChart() {
        VBox container = new VBox(5);
        container.getChildren().add(new Label("Mechanoform Population Growth"));
        
        // Define axes
        NumberAxis xAxis = new NumberAxis(0, 2000, 200);
        NumberAxis yAxis = new NumberAxis(0, 2, 0.2);
        xAxis.setLabel("Years");
        yAxis.setLabel("Population (billions)");
        
        // Create chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Mechanoform Population Growth (Precisely controlled 0.5% annual)");
        
        // Add data
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Population");
        
        // Calculate precise population growth
        double population = 0.4; // Starting at 0.4 billion
        for (int year = 0; year <= 2000; year += 50) {
            // Exactly 0.5% annual growth
            population *= Math.pow(1.005, 50); // Compound growth for 50 years
            series.getData().add(new XYChart.Data<>(year, population));
        }
        
        lineChart.getData().add(series);
        lineChart.setPrefHeight(300);
        container.getChildren().add(lineChart);
        
        return container;
    }
    
    private VBox createLuminariChart() {
        VBox container = new VBox(5);
        container.getChildren().add(new Label("Luminari Population Growth"));
        
        // Define axes
        NumberAxis xAxis = new NumberAxis(0, 1000, 100);
        NumberAxis yAxis = new NumberAxis(0, 20, 2);
        xAxis.setLabel("Years");
        yAxis.setLabel("Population (billions)");
        
        // Create chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Luminari Population Growth (5% growth during stellar activity)");
        
        // Add data
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Population");
        
        // Calculate population growth with solar cycle effects
        double population = 0.2; // Starting at 0.2 billion
        for (int year = 0; year <= 1000; year += 20) {
            // Model solar cycles every 100 years
            if ((year % 100) < 50) {
                // High stellar activity - 5% growth
                population *= Math.pow(1.05, 20);
            } else {
                // Low stellar activity - stable population
                // No change
            }
            series.getData().add(new XYChart.Data<>(year, population));
        }
        
        lineChart.getData().add(series);
        lineChart.setPrefHeight(300);
        container.getChildren().add(lineChart);
        
        return container;
    }
    
    private VBox createGravititesChart() {
        VBox container = new VBox(5);
        container.getChildren().add(new Label("Gravitites Population Growth"));
        
        // Define axes
        NumberAxis xAxis = new NumberAxis(0, 2000, 200);
        NumberAxis yAxis = new NumberAxis(0, 50, 5);
        xAxis.setLabel("Years");
        yAxis.setLabel("Population (billions)");
        
        // Create chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Gravitites Population Growth (0.8% annual with expansion boosts)");
        
        // Add data
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Population");
        
        // Calculate population growth with cave expansion boosts
        double population = 5.0; // Starting at 5 billion
        for (int year = 0; year <= 2000; year += 50) {
            // Add cave expansion boosts every 500 years
            if (year % 500 == 0 && year > 0) {
                population *= 1.5; // 50% boost after cave expansion
            } else {
                population *= Math.pow(1.008, 50); // Compound growth for 50 years
            }
            series.getData().add(new XYChart.Data<>(year, population));
        }
        
        lineChart.getData().add(series);
        lineChart.setPrefHeight(300);
        container.getChildren().add(lineChart);
        
        return container;
    }
    
    private VBox createNebulitesChart() {
        VBox container = new VBox(5);
        container.getChildren().add(new Label("Nebulites Population Growth"));
        
        // Define axes
        NumberAxis xAxis = new NumberAxis(0, 500, 50);
        NumberAxis yAxis = new NumberAxis(0, 30, 3);
        xAxis.setLabel("Years");
        yAxis.setLabel("Population (billions)");
        
        // Create chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Nebulites Population Growth (Variable -2% to +7% annual)");
        
        // Add data
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Population");
        
        // Calculate highly variable population growth
        double population = 12.0; // Starting at 12 billion
        for (int year = 0; year <= 500; year += 10) {
            // Generate variable growth rate between -2% and 7%
            double growthRate = Math.sin(year * 0.1) * 0.045 + 0.025; // Varies between -0.02 and 0.07
            population *= Math.pow(1 + growthRate, 10); // Compound growth for 10 years
            series.getData().add(new XYChart.Data<>(year, population));
        }
        
        lineChart.getData().add(series);
        lineChart.setPrefHeight(300);
        container.getChildren().add(lineChart);
        
        return container;
    }
    
    private VBox createChronosChart() {
        VBox container = new VBox(5);
        container.getChildren().add(new Label("Chronos Population Growth"));
        
        // Define axes
        NumberAxis xAxis = new NumberAxis(0, 500, 50);
        NumberAxis yAxis = new NumberAxis(0, 20, 2);
        xAxis.setLabel("Years (Linear Perception)");
        yAxis.setLabel("Population (billions)");
        
        // Create chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Chronos Population Growth (Non-linear temporal algorithm)");
        
        // Add data
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Population");
        
        // Calculate non-linear population growth
        double basePopulation = 5.0; // Starting at 5 billion
        for (int year = 0; year <= 500; year += 5) {
            // Complex temporal algorithm simulated using mathematical functions
            double temporalFactor = Math.sin(year * 0.05) * Math.cos(year * 0.03) * Math.sin(year * 0.02);
            double population = basePopulation * (1 + Math.abs(temporalFactor) * 2);
            
            // Add "echo" from future/past
            if (year % 50 == 0) {
                population *= 1.5; // Temporal echo boosting population
            }
            
            series.getData().add(new XYChart.Data<>(year, population));
        }
        
        lineChart.getData().add(series);
        lineChart.setPrefHeight(300);
        container.getChildren().add(lineChart);
        
        return container;
    }
    
    private VBox createSymbiontsChart() {
        VBox container = new VBox(5);
        container.getChildren().add(new Label("Symbionts Population Growth"));
        
        // Define axes
        NumberAxis xAxis = new NumberAxis(0, 500, 50);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        xAxis.setLabel("Years");
        yAxis.setLabel("Population (billions)");
        
        // Create chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Symbionts Population Growth (Stepped growth pattern)");
        
        // Add data
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Population");
        
        // Calculate stepped population growth
        double population = 7.0; // Starting at 7 billion
        boolean growthPhase = true;
        for (int year = 0; year <= 500; year += 5) {
            // Toggle between growth and plateau phases every 50 years
            if (year % 50 == 0 && year > 0) {
                growthPhase = !growthPhase;
            }
            
            if (growthPhase) {
                population *= Math.pow(1.10, 5); // 10% annual growth during growth phases
            }
            // No growth during plateau phases
            
            series.getData().add(new XYChart.Data<>(year, population));
        }
        
        lineChart.getData().add(series);
        lineChart.setPrefHeight(300);
        container.getChildren().add(lineChart);
        
        return container;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
