# Interface Segregation Principle (ISP)

Bu projede **SOLID prensiplerinden biri olan**  
**Interface Segregation Principle (ISP)**'i uyguladım.

---

## ISP Nedir?

Interface Segregation Principle'ın mantığı şu:  
Bir sınıf, kullanmadığı metotları içeren bir interface’e bağımlı olmamalıdır.

Yani büyük, her işe yarayan tek bir `Attacker` arayüzü yerine  
her davranış için ayrı, küçük arayüzler kullanmak gerekir.

---

## Oyun mantığı

Projede üç farklı karakter tipi var:

- **Warrior** → Yakın dövüş saldırısı yapar (`MeleeAttacker`)
- **Archer** → Uzaktan saldırı yapar (`RangedAttacker`)
- **Magician** → Büyü saldırısı yapar (`MagicAttacker`)

Her biri sadece kendi davranışını ilgilendiren interface’i uygular.  
Bu sayede karakterler, ilgisiz metotları implement etmek zorunda kalmaz.

---

##  Yanlış Tasarım

İlk başta tek bir `Attacker` interface’inde her saldırı türü vardı ama bu tasarım yanlıştı.  
Çünkü `Archer` sınıfı büyü yapmıyor, `Warrior` da ok atmıyor.
```java
// Yanlış tasarım: tek bir büyük interface
interface Attacker {
    void meleeAttack(GameCharacter target);
    void rangedAttack(GameCharacter target);
    void castSpell(GameCharacter target);
}

// Doğru tasarım: her saldırı türü için ayrı interface
interface MeleeAttacker {
    void meleeAttack(GameCharacter target);
}

interface RangedAttacker {
    void rangedAttack(GameCharacter target);
}

interface MagicAttacker {
    void castSpell(GameCharacter target);
}
