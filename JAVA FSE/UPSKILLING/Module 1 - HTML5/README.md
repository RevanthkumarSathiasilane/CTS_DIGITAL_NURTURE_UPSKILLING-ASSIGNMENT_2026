community-portal/
│
├── ex1/
│   └── index.html
│
├── ex2/
│   ├── index.html        ← updated (nav links added)
│   ├── events.html       ← NEW (nav needs this page)
│   ├── contact.html      ← NEW (nav needs this page)
│   └── help.html         ← NEW (external link target)
│
├── ex3/
│   ├── index.html        ← updated (welcome banner + ID/class)
│   ├── events.html
│   ├── contact.html
│   ├── help.html
│   └── styles.css        ← NEW (first CSS file)
│
├── ex4/
│   ├── index.html
│   ├── events.html       ← updated (image gallery added)
│   ├── contact.html
│   ├── help.html
│   ├── styles.css        ← updated (image + table styles)
│   └── images/           ← NEW
│
├── ex5/
│   ├── index.html
│   ├── events.html
│   ├── register.html     ← NEW (form needs its own page)
│   ├── contact.html
│   ├── help.html
│   └── styles.css        ← updated (form styles)
│
├── ex6/
│   ├── index.html
│   ├── events.html
│   ├── register.html     ← updated (event handlers added)
│   ├── feedback.html     ← NEW (feedback events need own page)
│   ├── contact.html
│   ├── help.html
│   └── styles.css
│
├── ex7/
│   ├── index.html
│   ├── events.html       ← updated (video section added)
│   ├── register.html     ← updated (onbeforeunload added)
│   ├── feedback.html
│   ├── contact.html
│   ├── help.html
│   ├── styles.css
│   └── videos/           ← NEW
│
├── ex8/
│   ├── index.html
│   ├── events.html
│   ├── register.html     ← updated (localStorage added)
│   ├── feedback.html
│   ├── contact.html
│   ├── help.html
│   └── styles.css
│
├── ex9/
│   ├── index.html
│   ├── events.html
│   ├── register.html
│   ├── feedback.html
│   ├── services.html     ← NEW (services page for portal)
│   ├── contact.html      ← updated (geolocation added)
│   ├── help.html
│   └── styles.css
│
└── ex10/
    ├── index.html        ← updated (console.logs added)
    ├── events.html       ← updated (console.logs added)
    ├── register.html     ← updated (console.logs added)
    ├── feedback.html     ← updated (console.logs added)
    ├── services.html
    ├── contact.html      ← updated (console.logs added)
    ├── help.html
    └── styles.css        ← updated (final cleanup)

    # Full Content Details for Every Page

---

## `index.html` — Home Page

### What This Page Contains Section by Section

---

**Document Head Section**
- Title says — Local Community Event Portal
- Meta description says — Welcome to your city's community event portal
- Links to styles.css
- Google Font import for clean typography

---

**Navigation Bar**
- Portal logo text on the left side saying — City Community Portal
- Links on the right side —
  - Home (links to index.html)
  - Events (links to events.html)
  - Register (links to register.html — appears from ex5 onwards)
  - Feedback (links to feedback.html — appears from ex6 onwards)
  - Services (links to services.html — appears from ex9 onwards)
  - Contact (links to contact.html)
  - Help (links to help.html, opens in new tab)

---

**Welcome Banner Section**
- Big heading saying — Welcome to the City Community Portal
- Subheading saying — Connecting residents with local events and services
- A paragraph saying — Stay informed, get involved, and make your community better. Browse upcoming events, register online, and access essential city services all in one place.
- A span inside the paragraph highlighted in red bold saying — Special Offer: Free registration for all events this month!
- The entire banner div has id="welcomeBanner" with blue background

---

**About Section**
- Heading saying — What is this Portal?
- Paragraph saying — The Local Community Event Portal is your one-stop destination for everything happening in your city. From cultural festivals to health camps, sports tournaments to cleanup drives — find it all here.
- Three small cards side by side with class="highlight" —
  - Card 1 — icon, heading "Browse Events", short text "Explore all upcoming community events"
  - Card 2 — icon, heading "Easy Registration", short text "Sign up for events in minutes"
  - Card 3 — icon, heading "City Services", short text "Access important local services"

---

**Events Preview Section**
- Has id="events"
- Heading saying — Upcoming Events
- Short intro saying — Here is a quick look at what is happening this month in your city
- Three event preview cards each containing —
  - Event name
  - Date and location
  - Short one line description
  - A "Register Now" button linking to register.html
- Events listed —
  - City Music Festival — June 15, Central Park — Enjoy live music from local artists
  - Community Cleanup Drive — June 20, River Bank — Join hands to keep our city clean
  - Health and Wellness Camp — June 25, City Hall — Free health checkups for all residents

---

**Contact Preview Section**
- Has id="contact"
- Heading saying — Get In Touch
- Short text saying — Have questions? Reach out to the city council
- A link saying "Visit Contact Page" linking to contact.html

---

**Footer**
- Left side — City Community Portal copyright 2024
- Center — Quick links repeating nav links
- Right side — Address saying City Council Office, 123 Main Street, Your City

---
---

## `events.html` — Events Page

### What This Page Contains Section by Section

---

**Navigation Bar**
- Same nav as index.html across all pages

---

**Page Header**
- Heading saying — Community Events
- Subheading saying — Relive the moments and explore what is coming next

---

**Past Events Image Gallery Section**
- Heading saying — Past Event Highlights
- Short text saying — Take a look at the wonderful moments from our recent community events
- A table with 2 rows and 3 columns, each cell contains —
  - An event image with alt text describing the event, title attribute on hover
  - Image has class="eventImage" for border styling
  - Caption below each image —
    - Image 1 — City Music Festival 2023
    - Image 2 — Community Cleanup Drive 2023
    - Image 3 — Health and Wellness Camp 2023
    - Image 4 — Sports Tournament 2023
    - Image 5 — Cultural Dance Program 2023
    - Image 6 — Food and Craft Fair 2023
  - Small text below caption saying the date and venue

---

**Upcoming Events Section**
- Heading saying — Upcoming Events Schedule
- A detailed table with columns — Event Name, Date, Venue, Type, Fee, Action
- Rows —
  - City Music Festival | June 15 2024 | Central Park | Cultural | Free | Register button
  - Cleanup Drive | June 20 2024 | River Bank | Environment | Free | Register button
  - Health Camp | June 25 2024 | City Hall | Health | Free | Register button
  - Sports Meet | July 5 2024 | Sports Complex | Sports | Free | Register button
  - Food Festival | July 12 2024 | Town Square | Cultural | Free | Register button

---

**Video Promo Section** *(added in ex7)*
- Heading saying — Watch Our Event Promo
- Short text saying — Get a feel for the energy and excitement of our community events
- Video element with controls, width set, and a poster image
- Below the video a paragraph with id="videoStatus" that shows — Video is ready to play! when oncanplay fires
- A note saying — Turn up the volume for the best experience

---

**Footer**
- Same footer as index.html across all pages

---
---

## `register.html` — Registration Page

### What This Page Contains Section by Section

---

**Navigation Bar**
- Same nav as all pages

---

**Page Header**
- Heading saying — Event Registration
- Subheading saying — Fill in your details to reserve your spot at any community event

---

**Registration Form Section**
- Heading saying — Register for an Event
- The form contains these fields in order —

  **Full Name field**
  - Label saying Full Name
  - Text input, autofocus, placeholder saying Enter your full name, required

  **Email Address field**
  - Label saying Email Address
  - Email input, placeholder saying Enter your email address, required

  **Phone Number field**
  - Label saying Phone Number
  - Text input, placeholder saying Enter 10 digit phone number
  - onblur fires and checks if it is exactly 10 digits, shows error message below if not

  **Date of Participation field**
  - Label saying Preferred Date
  - Date input, required

  **Event Type field**
  - Label saying Select Event
  - Dropdown select with options —
    - Select an Event (default disabled)
    - City Music Festival
    - Community Cleanup Drive
    - Health and Wellness Camp
    - Sports Tournament
    - Food and Craft Fair
  - onchange fires and displays the event fee below the dropdown
  - Fee display paragraph with id="eventFee" saying — Event Fee: Free

  **Message field**
  - Label saying Special Requests or Message
  - Textarea, placeholder saying Write any special requests or message here
  - Below textarea a paragraph showing — Characters typed: 0 that updates live using keyboard events

  **Save Preference checkbox** *(added in ex8)*
  - A checkbox saying Remember my event preference
  - When checked, saves selected event to localStorage

  **Submit button**
  - Button saying Register Now
  - onclick shows a confirmation alert saying Thank you for registering! We will contact you soon.

  **Output element**
  - Below the button a output element showing — Registration submitted successfully! when form submits

---

**Preference Section** *(added in ex8)*
- Small section below form
- Text saying — Your saved event preference will be auto-selected next time you visit
- A button saying Clear Preferences that clears both localStorage and sessionStorage
- A small text below saying — Preference cleared successfully when button is clicked

---

**Footer**
- Same footer as all pages

---
---

## `feedback.html` — Feedback Page

### What This Page Contains Section by Section

---

**Navigation Bar**
- Same nav as all pages

---

**Page Header**
- Heading saying — Share Your Feedback
- Subheading saying — Your experience helps us improve every event for the community

---

**Feedback Form Section**
- Heading saying — Event Feedback Form

  **Name field**
  - Label saying Your Name
  - Text input, placeholder saying Enter your name

  **Event Attended field**
  - Label saying Which Event Did You Attend
  - Dropdown with same event options as register page
  - onchange fires and shows a thank you message for attending that specific event below the dropdown

  **Rating field**
  - Label saying Rate Your Experience
  - Five radio buttons labeled 1 through 5
  - 5 is labeled Excellent, 1 is labeled Poor

  **Feedback Textarea**
  - Label saying Your Feedback
  - Large textarea, placeholder saying Share your thoughts about the event
  - Below the textarea a live character counter paragraph saying — Characters remaining: 300 that counts down as user types using keyboard events
  - Maximum 300 characters

  **Submit button**
  - Button saying Submit Feedback
  - onclick shows confirmation message below saying — Thank you for your valuable feedback!

---

**How We Use Feedback Section**
- Heading saying — How We Use Your Feedback
- Three points in a styled list —
  - We review all feedback after every event
  - Your suggestions help us improve future events
  - Top feedback contributors are recognized at annual events

---

**Footer**
- Same footer as all pages

---
---

## `services.html` — Services Page

### What This Page Contains Section by Section

---

**Navigation Bar**
- Same nav as all pages

---

**Page Header**
- Heading saying — Community Services
- Subheading saying — Everything your city offers, all in one place

---

**Emergency Contacts Section**
- Heading saying — Emergency Contacts
- A styled table with columns — Service, Contact Number, Available
- Rows —
  - Police Control Room | 100 | 24 hours
  - Fire Station | 101 | 24 hours
  - Ambulance | 108 | 24 hours
  - City Council Helpline | 1800-XXX-XXXX | 9am to 6pm
  - Women Helpline | 1091 | 24 hours
- Table has zebra striping, collapsed borders, centered text

---

**City Services List Section**
- Heading saying — Available City Services
- A styled unordered list with no default bullets, custom styling —
  - Water Supply and Billing
  - Electricity Complaints
  - Road and Infrastructure Issues
  - Waste Collection Schedule
  - Public Transport Information
  - Birth and Death Certificate Services
  - Property Tax Payment
  - City Library Access

---

**Community Bulletin Section**
- Heading saying — Community Bulletin Board
- Short intro saying — Latest announcements and notices from the city council
- A div with two column newspaper layout containing three short bulletin articles —
  - Article 1 — New Park Opening — The city council is pleased to announce the opening of a new park in the eastern district next month with facilities for all age groups
  - Article 2 — Road Repair Notice — Residents are informed that road repair work will begin on Highway 4 from June 10 and may cause minor traffic delays
  - Article 3 — Vaccination Drive — A free vaccination drive for children will be held at City Hall on June 18 from 9am to 4pm

---

**Useful Links Section**
- Heading saying — Useful Links
- A list of styled links —
  - City Council Official Website
  - Online Tax Payment Portal
  - Public Transport Schedule
  - City Library Catalog
  - Waste Collection Calendar
- All links styled with hover, visited, active states

---

**Footer**
- Same footer as all pages

---
---

## `contact.html` — Contact Page

### What This Page Contains Section by Section

---

**Navigation Bar**
- Same nav as all pages

---

**Page Header**
- Heading saying — Contact Us
- Subheading saying — We are here to help. Reach out to the city council anytime.

---

**Contact Information Section**
- Heading saying — City Council Contact Details
- Three info cards side by side —
  - Card 1 — Address — City Council Office, 123 Main Street, City Center, Your City — 400001
  - Card 2 — Phone — General Enquiries: 1800-XXX-XXXX, Event Helpline: 1800-XXX-XXXY, Available Monday to Saturday 9am to 6pm
  - Card 3 — Email — events@citycouncil.gov, support@citycouncil.gov, Response within 24 hours

---

**Find Nearby Events Section** *(geolocation added in ex9)*
- Heading saying — Find Events Near You
- Short text saying — Allow location access to discover community events happening closest to you
- A button saying Find Nearby Events
- Below the button a div with id="locationResult" that shows —
  - On success — Your Location: Latitude X.XXXX, Longitude X.XXXX. Searching for events near you...
  - On permission denied — Location access denied. Please enable location in your browser settings.
  - On timeout — Location request timed out. Please try again.

---

**Simple Contact Form Section**
- Heading saying — Send Us a Message
- Note saying — This form does not submit to a server. It is for demonstration purposes.
- Fields —
  - Name text input with placeholder
  - Email input with placeholder
  - Subject text input with placeholder
  - Message textarea with placeholder
  - Send Message button with onclick showing — Message received! We will get back to you within 24 hours.

---

**Help Link Section**
- A paragraph saying — Need help using this portal?
- A link saying Visit our Help Page that points to help.html and opens in a new tab

---

**Footer**
- Same footer as all pages

---
---

## `help.html` — Help Page

### What This Page Contains Section by Section

---

**Navigation Bar**
- Same nav as all pages

---

**Page Header**
- Heading saying — Help and FAQs
- Subheading saying — Find answers to common questions about the portal

---

**How to Use Section**
- Heading saying — How to Use This Portal
- A numbered list —
  - Open the Home page and browse upcoming events
  - Click on any event to see full details
  - Click Register Now to go to the registration form
  - Fill in your details and click Register
  - Visit the Feedback page after attending to share your experience
  - Use the Services page for emergency contacts and city services
  - Use the Contact page to reach the city council directly

---

**FAQ Section**
- Heading saying — Frequently Asked Questions
- Each question is bold, answer is a normal paragraph below it —

  **Q: Is registration free?**
  A: Yes, registration for all events through this portal is completely free of charge.

  **Q: Can I register for multiple events?**
  A: Yes, you can register for as many events as you like by filling the registration form separately for each event.

  **Q: How will I know my registration is confirmed?**
  A: After submitting the form you will see a confirmation message on the page. The city council will also contact you via the email you provided.

  **Q: Can I save my preferences?**
  A: Yes, on the registration page you can check the Remember my event preference option and your selection will be saved for your next visit.

  **Q: What if I face issues with the portal?**
  A: Please use the Contact page to send a message to the city council team and they will respond within 24 hours.

  **Q: Is my personal data safe?**
  A: This portal does not store any data on a server. All preferences are saved locally in your own browser only.

---

**Back to Home Section**
- A paragraph saying — Done reading?
- A link saying Go Back to Home Page linking to index.html

---

**Footer**
- Same footer as all pages

---
---

## Summary Table — What Content Appears in Which Exercise

| Content | Page | Appears In |
|---|---|---|
| HTML5 shell only | index.html | ex1 |
| Nav bar with anchor links | index.html | ex2 |
| events, contact, help pages created | multiple | ex2 |
| Welcome banner, highlight class, span | index.html | ex3 |
| styles.css linked everywhere | all pages | ex3 |
| Image gallery table with captions | events.html | ex4 |
| Full registration form | register.html | ex5 |
| Event handlers on form and gallery | register, feedback | ex6 |
| Feedback page created | feedback.html | ex6 |
| Video section with oncanplay | events.html | ex7 |
| onbeforeunload on register page | register.html | ex7 |
| localStorage and clear button | register.html | ex8 |
| Services page created | services.html | ex9 |
| Geolocation button and result | contact.html | ex9 |
| Console logs across all pages | all pages | ex10 |