# **FotoServis**
### _Maven + Java + Selenium_

###### Website testing project


****Final work published at:**** 
 *git@github.com:onablo/BaigiamasisDarbas.git*

****Website link:****  https://www.fotoservisas.lt

## Testing cases:
1. ### Check menu function: photo categories
- Click photo categories submenu
- Expecting text: "_NUOTRAUKOS INTERNETU_"
  
2. ### Check photo ordered function
- Click photo categories submenu
- Click photo-formats "10x15"
- Choose input property "Popierius"
- Choose input property "Spalvingumas"
- Choose input property "Vaizdo talpinimas"
- Click on field for photo input
- Choose photo from computer
- Drug and drop photo
- Expected text "Preke itraukta i krepseli"

3. ### Check photo frame ordered function from product list
- Click roducts submenu
- Click "Suvenyriniai-remeliai"
- Click "Remelis-wd10-10x15"
- Click "Ideti i krepseli"
- Expected text "Preke itraukta i krepseli"

4. ### Check ordered products content 
- Click "Krepselyje" order
- Check photo addition
- Check frame addition
- Press "Testi"
- Expected login button

5. ### Check Login function
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