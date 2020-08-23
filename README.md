# JetpactNavigationDemo
A demo project on how to use Jetpack Navigation architecture component in General and also with Navigation UI components like Collapsible Toolbal, NavigationView and BottomNaviagtionView with minimal boilerplate code.


## Main components of Jetpact navigation architecture component
1. **Navigation graph (xml) -**
An XML resource file where you can define the whole navigation structure using Destinations (Activities, Fragments or custom ones) and Actions (Navigating from one destination to other)
2. **Navigation Host (NavHostFragment) -** 
The Host fragment which handles all the fragment transaction which holds the current destination when navigated.
3. **Navigation controller -**
You can use the navigation controller to navigate to different destination programmatically by passing action ids and if needed Bundle of arguments.

## Navigation UI
You can use navigation UI components to make navigation automatically work without need to handle click events manually
1. **NavigationView (Navigation Drawer)**
2. **BottomNavigationView**
