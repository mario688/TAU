from selenium import webdriver
import time


def szukanieFilmuOrazOdtwarzanie():
    driver = webdriver.Chrome(
        executable_path=r'C:\Users\gliwa\Desktop\TAU\chromedriver.exe')
    youtubeUrl = "https://www.youtube.com/"
    driver.get(youtubeUrl)
    driver.maximize_window()
    # akceptacja pików cooki
    driver.find_element_by_xpath(
        "//*[@id='yDmH0d']/c-wiz/div/div/div/div[2]/div[1]/div[4]/form").click()
    # wyszukanie filmu
    driver.find_element_by_xpath(
        "//*[@id='search']").click()
    # wpisanie tytułu do wyszukania
    driver.find_element_by_xpath(
        "//*[@id='search']").send_keys("gangnam style")
    # kliknięcie szukaj
    driver.find_element_by_xpath(
        "//*[@id = 'search-icon-legacy']").click()
    # poczekanie sekundy na załadowanie wynikków
    time.sleep(1)
    driver.find_element_by_xpath(
        "//*[@id='video-title']/yt-formatted-string").click()


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
        "//*[@id='collection_view_catalog-filters']/div[1]/div/div/button").click()

    cenaOdNajwyzszej = driver.find_element_by_xpath(
        " //*[@id='z-nvg-cognac-root']/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/div/div/div/ul/li[4]").click()

    # akceptacja udostępniania treści reklamowych baner
    # driver.find_element_by_xpath("//*[@id='uc-btn-accept-banner']").click()
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


szukanieFilmuOrazOdtwarzanie()
# DodawanieDoKoszyka()
# szukanieProduktu()
