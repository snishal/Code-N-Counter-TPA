# TPA : The Plant App

## Inspiration
We recently went to a village, and to our surprise, we didn't know the names of any crops. We could not identify them. So we came to a realization that the youth is forgetting our farming culture. We decided to do something about it.

## What it does
The user simply points the camera to the crop and the app identifies it and provides the user with a description and details. Farmers can also point the app to crops and identify whether the crop is disease infected. That'll help them to find suitable measures to prevent further damage.

## How we built it
We began with dataset collection. Then we trained a model to identify different crops & the infected crops. We then converted the model to tensor flow lite to use it in our Android app. and Finally we built the app with this offline tflite model.

## Challenges we ran into
- Finding the dataset. we scraped a lot of websites for images and datasets. This was the hardest part.
- Training the model. Finding out the optimal iterations and parameters took some time.
- Kotlin. None of us knew kotlin. So it took us some time to get started with the app.

## Accomplishments that we're proud of
Successfully built a working demo for the flower database.

## What we learned
- How to train a custom tensor flow lite model.
- Working with kotlin.
- Scraping datasets and images.

## What's next for TPA : The Plant App
Crop health Prediction based on current state of crops.
Integrated Google Maps to directly upload field pictures and serve as a local guide.

## Ref 

- [Tensorflow lite tutorial](https://heartbeat.fritz.ai/building-pok%C3%A9dex-in-android-using-tensorflow-lite-and-firebase-cc780848395)

