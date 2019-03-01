//
//  ViewController.swift
//  WeatherApp
//
//  Created by Angela Yu on 23/08/2015.
//  Copyright (c) 2015 London App Brewery. All rights reserved.
//

import UIKit
import CoreLocation
import Alamofire
import SwiftyJSON


class WeatherViewController: UIViewController, CLLocationManagerDelegate {
    
    //Constants
    let WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather"
    let APP_ID = "8956d27b5393db0aa1fbc8153635fcc4"
    /***https://openweathermap.org/appid ****/
    

    //TODO: Declare instance variables here
    let locationManager = CLLocationManager()
    

    //Pre-linked IBOutlets
    @IBOutlet weak var weatherIcon: UIImageView!
    @IBOutlet weak var cityLabel: UILabel!
    @IBOutlet weak var temperatureLabel: UILabel!

    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        
        //TODO:Set up the location manager here.
        locationManager.delegate = self
        locationManager.desiredAccuracy = kCLLocationAccuracyHundredMeters
        locationManager.requestWhenInUseAuthorization()
        locationManager.startUpdatingLocation()
    }
    
    
    
    //MARK: - Networking
    /***************************************************************/
    
    //Write the getWeatherData method here:
    func getWeatherData(url: String, parameters: [String : String]) {
        Alamofire.request(url, method: .get, parameters: parameters).responseJSON {
            response in
            if response.result.isSuccess {
                print("Success Got weather data")
                
                let weatherJSON : JSON = JSON(response.result.value!)
                self.updateWeatherData(json:weatherJSON)
                
            } else {
                print("result \(response.result.error!)")
                self.cityLabel.text = "Connection issue"
            }
        }
        
        
    }
    
    //MARK: - JSON Parsing
    /***************************************************************/
   
    
    //Write the updateWeatherData method here:
    func updateWeatherData(json: JSON) {
        let tempResult = json["main"]["temp"]
    }
    

    
    
    
    //MARK: - UI Updates
    /***************************************************************/
    
    
    //Write the updateUIWithWeatherData method here:
    
    
    
    
    
    
    //MARK: - Location Manager Delegate Methods
    /***************************************************************/
    
    
    //Write the didUpdateLocations method here:
    func locationManager(_ manager: CLLocationManager, didUpdateLocations locations: [CLLocation]) {
        let location = locations[locations.count - 1]
        if location.horizontalAccuracy > 0 {
            // stop updating location as soon as you've gotten a valid result
            locationManager.stopUpdatingLocation()
            // receive the data once by removing the current class from receiving messages from the location
            // while in the process of being stopped
            locationManager.delegate = nil
            
            let latitude = location.coordinate.latitude
            let longitude = location.coordinate.longitude
//            print("logitude: \(location.coordinate.longitude), latitude: \(location.coordinate.latitude)")
            let params : [String:String] = ["lat" : String(latitude), "lon" : String(longitude), "appid" : APP_ID]
            
            getWeatherData(url: WEATHER_URL, parameters: params)
            
        }
    }
    
    
    
    //Write the didFailWithError method here:
    
    func locationManager(_ manager: CLLocationManager, didFailWithError error: Error) {
        print(error)
        cityLabel.text = "Location unavailable"
    }
    

    
    //MARK: - Change City Delegate methods
    /***************************************************************/
    
    
    //Write the userEnteredANewCityName Delegate method here:
    

    
    //Write the PrepareForSegue Method here
    
    
    
    
    
}


