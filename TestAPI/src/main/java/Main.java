import org.springframework.web.client.RestTemplate;

public class Main {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
//        Account account = restTemplate.getForObject("http://localhost:8080/JV51_APIDemo_war_exploded/account/1", Account.class);
//        System.out.println(account.getOwnerName());
        Account newAcc = new Account();
        newAcc.setOwnerName("Huynh Hieu");
        newAcc.setBalance(250);

        String result = restTemplate.postForObject("http://localhost:8080/JV51_APIDemo_war_exploded/account", newAcc, String.class);
    }
}
