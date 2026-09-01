# real-time-blood-monitoring-and-donor-matching-system
A hybrid, microservices-driven healthcare platform designed to bridge the gap between emergency blood demand and available supply. The system combines a Spring Boot core for real-time orchestration and persistent storage with a Python FastAPI engine for machine learning inference, dynamic donor prioritization, and predictive demand analytics.  

PROJECT UTILIZES SPRING FLASH API BY HackermanMe (on github : [spring-flashapi](https://github.com/HackermanMe/spring-flashapi))

Key Features
1. Real-Time Inventory Tracking: Delivers instant stock updates and live dashboard notifications to healthcare facilities via WebSockets.
2. Donor Eligibility Matching (Random Forest): Ranks candidate donors by evaluating blood group compatibility, age, health status metrics, and historical donation frequency.
3.  Emergency Prioritization (Mamdani Fuzzy Logic): Resolves situational ambiguity during critical requisitions by dynamically scoring candidates on relative distance, live  availability, and health indices.
4.  Predictive Demand Forecasting (Linear Regression): Analyzes historical consumption trends to predict future blood group requirements across 7-, 14-, and 30-day windows to prevent stockouts.
5.  Automated Emergency Dispatches: Pushes targeted alerts via SMS and email directly to top-ranked donor candidates during shortages.  
