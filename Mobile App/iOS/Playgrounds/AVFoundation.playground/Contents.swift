import UIKit

// import the module
import AVFoundation

// Create a class-scope variable
var audioPlayer: AVAudioPlayer!

let soundURL = Bundle.main.url(forResource: "fileName", withExtension: "wav")

do {
    audioPlayer = try AVAudioPlayer(contentsOf: soundURL!)
} catch {
    print(error)
}

audioPlayer.play()
