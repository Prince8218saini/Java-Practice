package util;

public class ATMUI {

    public void welcome() {
        System.out.println("""
        ╔════════════════════════════════════════════╗
        ║              🏦  JAVA BANK ATM             ║
        ║--------------------------------------------║
        ║      💳 Secure Banking | ⚡ Fast Service   ║
        ║        Welcome Customer 😊                 ║
        ╚════════════════════════════════════════════╝
        """);
    }

    public void loading() {
        System.out.print("🔄 Processing");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(250);
            } catch (Exception e) {}
            System.out.print(" .");
        }
        System.out.println();
    }

    public void menu() {
        System.out.println("""
        ╔══════════════ 🏧 ATM MENU 🏧 ══════════════╗
        ║ 1️⃣  👤 My Profile                          ║
        ║ 2️⃣  💰 Check Balance                       ║
        ║ 3️⃣  ➕ Deposit Money                       ║
        ║ 4️⃣  ➖ Withdraw Money                      ║
        ║ 5️⃣  🧾 Mini Statement                      ║
        ║ 6️⃣  🔐 Change PIN                          ║
        ║ 7️⃣  ❌ Exit                                ║
        ╚════════════════════════════════════════════╝
        """);
    }

    public void success(String msg) {
        System.out.println("✅ " + msg + " 🎉");
    }

    public void error(String msg) {
        System.out.println("❌ " + msg);
    }

    public void info(String msg) {
        System.out.println("ℹ️  " + msg);
    }

    public void thankYou() {
        System.out.println("""
        ╔════════════════════════════════════════════╗
        ║      🙏 Thank You for Banking with Us      ║
        ║        💙 Have a Nice Day 😊               ║
        ╚════════════════════════════════════════════╝
        """);
    }
}
