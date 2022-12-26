import org.springframework.web.client.RestTemplate;

public class Main {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Account account = new Account();
        account.setOwnerName("Vai Tai");
        account.setBalance(750);

        Account account1 = restTemplate.postForObject("http://localhost:8080/JV51_APIDemo_war_exploded/account", account, Account.class);
    }
}
