# **Maven + Java + Selenium demo project**
## Setup
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`
### Site used for testing

[FotoServis](https://www.fotoservisas.lt)

****Final work published at:****
*https://github.com/onablo/BaigiamasisDarbas.git*

## Testing cases:

### 1. Check photo ordered function, ordering photo 10x15 from list
- Click photo categories submenu
- Close cookies agreement with waiting
- Click photo-formats "10x15"
- Get expected text in opened window

### 2. Check photo frame ordered function from products list
- Click products submenu
- Close cookies agreement with waiting
- Click "Suvenyriniai-remeliai"
- Click "Frame-wd10-10x15"
- To choose product quantity  
- Click add to order list
- Expected text in opened window "Preke itraukta i krepseli"

### 3. Check ordered products content 
- Click order list
- Check frame addition
- Press "Testi"
- Expected login button

### 4. Check Login function
- Click Login 
- Click Register
- Click "Fizinis asmuo"
- Fill Email input 
- Fill Password input
- Fill Repeat password input
- Fill Name input
- Fill Surname input
- Fill Phone Nr input
- Press agreement checkbox
- Click "Registruotis"
- Expected window asking to save password 