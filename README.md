Condrache_Valentin_ActivitateCTS2024

A12-Design Pattern-Observer
Spitalul dorește să anunțe toți pacienții care au fost în spital ori de câte ori apare vreo urgență
cu privire la viruși existenți în oraș. Astfel se dorește implementarea unui modul care atunci când
apare o epidemie sau un virus nou să se trimită notificări tuturor persoanelor abonate la notificările
spitalului.

A14-Design Pattern-Template
Internarea unui pacient se face după următorii pași: Se analizează dificultatea stării pacientului,
Se verifica disponibilitatea in saloanele spitalului, Se emite fisa de internare. Sa se implementeze
modului care realizează in aplicație internarea pacienților după acest pattern.

B14-Design Pattern-Template
Ocuparea unei mese in restaurant se face după următorii pași: Se curata masa, Se așază 
șervetele, Se așază tacâmuri, sunt invitate persoanele sa se așeze la masa. Sa se implementeze
modului care realizează in aplicație ocuparea meselor din restaurant.

C12-Design Pattern-Observer
Farmacia dorește să anunțe toți clienții abonați la notificările farmaciei cu privire la ofertele de
preț pentru anumite medicamente. Astfel se dorește implementarea unui modul care atunci când
apare o ofertă să se trimită notificări tuturor persoanelor abonate la notificările farmaciei.

C14-Design Pattern-Template
Achiziția de medicamente in Farmacie se face după o procedura bine stabilita care conține
următorii pași: Se primește rețeta, se verifică în sistem stocul medicamentelor cerute, daca stocul
este suficient se merge in depozit si se aduc medicamentele, daca stocul nu este suficient nu se
face achiziția, se aduc medicamentele, se încasează banii, se scade din stoc si se emite bonul.

D1-Design Pattern-Simple Factory
Banca oferă clienților pachete pentru realizarea de credite de nevoie personale sau credite
ipotecare. Să se implementeze modulul de construire de obiecte din familia creditelor.

D2-Design Pattern-Factory Method
Banca oferă servicii pentru persoane juridice și pentru persoane fizice. Să se implementeze
modulul care construiește obiecte din familia de clienți ai băncii. Modulul trebuie realizat, astfel
încât pentru adăugări de noi tipuri de clienți să nu fie necesare modificări în codul existent.

D5-Design Pattern-Adapter
Banca achiziționează un framework pentru oferirea de credite de leasing, însă clasele din acest
framework nu sunt asemănătoare cu clasele utilizate de aplicația existentă. Se cere echipei IT să
creeze un modul care să permită utilizarea claselor din framework-ul nou achiziționat, împreună
cu clasele deja existente în aplicație.

D6-Design Pattern-Decorator
Clienții care dețin cont bancar cu card atașat, pot realiza plăți online cu acel card, sau plăți la
normale cu cardul. Banca decide să adauge o nouă funcționalitate cardurilor și anume plata
ContactLess. Astfel se cere echipei IT să implementeze un modul care să adauge cardurilor această
nouă funcționalitate.

D7-Design Pattern-Facade
Banca dorește simplificarea procesului de creare a unui cont. În momentul de față pentru crearea
unui cont un operator de la bancă trebuie să verifice vârsta persoanei, să verifice dacă este urmărit
de poliție sau dacă are creanțe la alte bănci. Să se realizeze un modul pentru simplificarea
procesului pentru operator.

D8-Design Pattern-Proxy
Banca ia hotărârea sa se realizeze credite doar în RON, deși în momentul de față oferă
posibilitatea creării de conturi în orice monedă. Să se realizeze un nivel intermediar pentru clasa
Credit, care să permită realizarea contului doar dacă se cere să fie în RON.

D9-Design Pattern-Composite
Să se implementeze structura ierarhică a agențiilor băncii știindu-se faptul că o sucursală deține
mai multe agenții, iar o agenție deține mai multe filiale.

D11-Design Pattern-Strategy
Atunci când un client vine la banca, procesarea documentelor se realizează în funcție de tipul
de client. Pentru clienții persoane fizice se solicită doar buletinul și adeverință de la munca, iar
pentru clienții persoane juridice se solicita actele de înființare a firmei precum si dovada
înregistrării la Registrul comerțului. Sa se implementeze modulul de verificare acte, știindu-se
faptul că un client anunță când ajunge la ghișeu ce fel de client este. Deci stabilirea modului de
procesare se stabilește la run-time.

D12-Design Pattern-Observer
Banca dorește să anunțe toți clienții abonați la notificări. Să se implementeze funcționalitatea
de a trimite notificări clienților abonați. Acest proces se realizează pentru toți clienții băncii abonați
la notificări.

D14-Design Pattern-Template
Retragerile de bani de la bancomat se fac după următorii pași: se introduce cardul, se introduce
pinul, se specifica suma solicitata, se retrag banii din bancomat și la final se retrage cardul. Sa se
implementeze modulul care realizează acest algoritm.

E12-Design Pattern-Observer
Managerul unei Sali de sport dorește să anunțe toți clienții abonați la notificări atunci când este
programat un nou meci de fotbal, de handbal sau de volei. Să se implementeze funcționalitatea de
a trimite notificări clienților abonați. Acest proces se realizează pentru toți clienții abonați la
notificări.

E14-Design Pattern-Template
Intrarea pe stadion si ocuparea locurilor se face pentru toata lumea la fel urmând pașii: Se
așază la coada, Se prezinta biletul, Se face controlul corporal, Se intra in stadion, Se ocupa locul.
Sa se realizeze modulul care simulează în aplicație procesul de intrare pe stadion și de ocupare a
locurilor.
