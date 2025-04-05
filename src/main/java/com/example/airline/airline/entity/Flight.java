package com.example.airline.airline.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "flight_price_dataset_of_bangladesh")
public class Flight {

    @Id
    private int id;

    @Column(name = "Airline")
    private String airline;

    @Column(name = "Source")
    private String source;

    @Column(name = "Source Name")
    private String sourceName;

    @Column(name = "Destination")
    private String destination;

    @Column(name = "Destination Name")  // Corrected to match the column name in the schema
    private String destinationName;

    @Column(name = "Departure Date & Time")  // Corrected to match the column name in the schema
    private String departureDateTime;

    @Column(name = "Arrival Date & Time")  // Corrected to match the column name in the schema
    private String arrivalDateTime;

    @Column(name = "Duration (hrs)")  // Corrected to match the column name in the schema
    private double durationHours;

    @Column(name = "Stopovers")
    private String stopovers;

    @Column(name = "Aircraft Type")  // Corrected to match the column name in the schema
    private String aircraftType;

    @Column(name = "Class")  // Corrected to match the column name in the schema
    private String flightClass;

    @Column(name = "Booking Source")  // Corrected to match the column name in the schema
    private String bookingSource;

    @Column(name = "Base Fare (BDT)")  // Corrected to match the column name in the schema
    private double baseFareBDT;

    @Column(name = "Tax & Surcharge (BDT)")  // Corrected to match the column name in the schema
    private double taxSurchargeBDT;

    @Column(name = "Total Fare (BDT)")  // Corrected to match the column name in the schema
    private double totalFareBDT;

    @Column(name = "Seasonality")
    private String seasonality;

    @Column(name = "Days Before Departure")  // Corrected to match the column name in the schema
    private int daysBeforeDeparture;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public double getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(double durationHours) {
        this.durationHours = durationHours;
    }

    public String getStopovers() {
        return stopovers;
    }

    public void setStopovers(String stopovers) {
        this.stopovers = stopovers;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public String getBookingSource() {
        return bookingSource;
    }

    public void setBookingSource(String bookingSource) {
        this.bookingSource = bookingSource;
    }

    public double getBaseFareBDT() {
        return baseFareBDT;
    }

    public void setBaseFareBDT(double baseFareBDT) {
        this.baseFareBDT = baseFareBDT;
    }

    public double getTaxSurchargeBDT() {
        return taxSurchargeBDT;
    }

    public void setTaxSurchargeBDT(double taxSurchargeBDT) {
        this.taxSurchargeBDT = taxSurchargeBDT;
    }

    public double getTotalFareBDT() {
        return totalFareBDT;
    }

    public void setTotalFareBDT(double totalFareBDT) {
        this.totalFareBDT = totalFareBDT;
    }

    public String getSeasonality() {
        return seasonality;
    }

    public void setSeasonality(String seasonality) {
        this.seasonality = seasonality;
    }

    public int getDaysBeforeDeparture() {
        return daysBeforeDeparture;
    }

    public void setDaysBeforeDeparture(int daysBeforeDeparture) {
        this.daysBeforeDeparture = daysBeforeDeparture;
    }
}
