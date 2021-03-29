from selenium import webdriver

urlZalando = 'https://www.zalando.pl/'
urlFacebook = 'https://www.facebook.com/'


# driver = webdriver.Opera(executable_path=r'C:\Users\gliwa\Desktop\TAU\operadriver.exe')

# driver = webdriver.Edge(executable_path=r'C:\Users\gliwa\Desktop\TAU\msedgedriver.exe')


def LogowanieDoZalandoTest():
    # ======TEST  LOGOWANIE DO ZALANDO=========
    driver = webdriver.Chrome(
        executable_path=r'C:\Users\gliwa\Desktop\TAU\chromedriver.exe')  # bez 'r' nie działała ścieżka
    # wejście na strone zalando
    driver.get(urlZalando)
    # powiększenie okna
    driver.maximize_window()

    # znalezienie ikony do logowania
    button_login = driver.find_element_by_class_name(
        "z-navicat-header_navToolItem")
    button_login.click()
    # znalezienie okna do podania emailu
    input_login = driver.find_element_by_id('login.email')
    input_login.send_keys("jakisemail@wp.xd")
    print("Email entered")
    # znalezienie okna do podania hasła
    inpit_pass = driver.find_element_by_id('login.password')
    inpit_pass.send_keys("pasxdasdd!@V")
    print("Password entered")
    # znalezienie guzika zaloguj
    button_zaloguj = driver.find_element_by_css_selector(
        '[data-testid="login_button"]')

    button_zaloguj.click()
    driver.quit()


def DodawanieDoKoszyka():
    # ======Dodawanie produktu do koszyka=========
    driver = webdriver.Chrome(
        executable_path=r'C:\Users\gliwa\Desktop\TAU\chromedriver.exe')
    urlZalando = 'https://www.zalando.pl/'
    # wejście na strone zalando
    driver.get(urlZalando)
    # powiększenie okna
    driver.maximize_window()
    obowie_input = driver.find_element_by_css_selector(
        '[aria-label="Obuwie"]')
    obowie_input.click()
    sortowanieLista = driver.find_element_by_xpath(
        "//*[@id='z-nvg-cognac-root']/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/div/button").click()

    cenaOdNajwyzszej = driver.find_element_by_xpath(
        " //*[@id='z-nvg-cognac-root']/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/div/div/div/ul/li[4]").click()
    # akceptacja udostępniania treści reklamowych baner
    driver.find_element_by_xpath("//*[@id='uc-btn-accept-banner']").click()
    produkt_input = driver.find_element_by_xpath(
        "/html/body/div[4]/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div[1]/div[1]/article")
    produkt_input.click()
    produkt_rozmiar = driver.find_element_by_xpath(
        "//*[@id='picker-trigger']")
    produkt_rozmiar.click()
    wybranie_rozmiaru = driver.find_element_by_xpath(
        "/html/body/div[7]/div/div[3]/div/form/div/div[1]/div/label/span/div").click()
    dodajDoKoszykaButton = driver.find_element_by_css_selector(
        '[aria-label="Dodaj do koszyka"]').click()


def szukanieProduktu():
    # ======szukanie produktu=========
    driver = webdriver.Chrome(
        executable_path=r'C:\Users\gliwa\Desktop\TAU\chromedriver.exe')
    urlZalando = 'https://www.zalando.pl/'
    # wejście na strone zalando
    driver.get(urlZalando)
    # powiększenie okna
    driver.maximize_window()
    driver.find_element_by_xpath(
        "//*[@id='z-navicat-header-root']/header/div[2]/div/div/div/div[1]/div/div/div/div[2]/div[3]/form/div/input").send_keys("nike")


def LogowanieDoFacebookaTest():
    urlFacebook = 'https://www.facebook.com/'
    # ======TEST 1 LOGOWANIE DO FACEBOOKA=========
    driver = webdriver.Chrome(
        executable_path=r'C:\Users\gliwa\Desktop\TAU\chromedriver.exe')  # bez 'r' nie działała ścieżka
    # wejście na strone facebook
    driver.get(urlFacebook)
    # powiększenie okna
    driver.maximize_window()
    # znalezienie okna do podania emaila
    driver.find_element_by_css_selector(
        '[data-cookiebanner="accept_button"]').click()
    username_box = driver.find_element_by_id('email')
    # wpisanie emaila
    username_box.send_keys("jakiśtamemail@wp.pl")
    print("Email entered")
    # znalezienie okna do podania hasła
    password_box = driver.find_element_by_id('pass')
    # wpisanie hasła
    password_box.send_keys("jakieśąśI&(!@h")
    print("Password entered")

    # znalezienie guzika zaloguj
    login_box = driver.find_element_by_css_selector(
        '[data-testid="royal_login_button"]')
    # logowanie

    login_box.click()

    print("Done")
    driver.quit()
    print("Finished")


def NiePamietaszHasla():
    urlFacebook = 'https://www.facebook.com/'
    # ======TEST 1 RESET HASŁa DO FACEBOOKA=========
    driver = webdriver.Chrome(
        executable_path=r'C:\Users\gliwa\Desktop\TAU\chromedriver.exe')  # bez 'r' nie działała ścieżka
    # wejście na strone facebook
    driver.get(urlFacebook)
    # powiększenie okna
    driver.maximize_window()

    driver.find_element_by_css_selector(
        '[data-cookiebanner="accept_button"]').click()
    driver.find_element_by_class_name("_6ltj").click()
    driver.find_element_by_id(
        "identify_email").send_keys("jakisemail@wp.xd")
    driver.find_element_by_id("did_submit").click()


def ZmianaJęzykaNaSlaski():
    urlFacebook = 'https://www.facebook.com/'
    # ======TEST zmiana jezyka na slaski=========
    driver = webdriver.Chrome(
        executable_path=r'C:\Users\gliwa\Desktop\TAU\chromedriver.exe')  # bez 'r' nie działała ścieżka
    # wejście na strone facebook
    driver.get(urlFacebook)
    # powiększenie okna
    driver.maximize_window()

    driver.find_element_by_css_selector(
        '[data-cookiebanner="accept_button"]').click()

    driver.find_element_by_css_selector(
        '[title="Silesian"]').click()


szukanieProduktu()
ZmianaJęzykaNaSlaski()
LogowanieDoFacebookaTest()
