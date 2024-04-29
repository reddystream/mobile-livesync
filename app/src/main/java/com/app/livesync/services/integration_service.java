package com.app.livesync.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


public class integration_service extends Service {
    public integration_service() {
        //implementar

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


   /*public class PaymentService {
        public void transfer(String apiKey, String accountId, int amount) {

            Stripe.apiKey = apiKey;

            TransferCreateParams params = TransferCreateParams.builder()
                    .setAmount(amount)
                    .setCurrency("usd")
                    .setDestination(accountId)
                    .build();

            try {
                Transfer transfer = Transfer.create(params);
                System.out.println("Transferência bem-sucedida: " + transfer.getId());
            } catch (StripeException e) {
                e.printStackTrace();
            }
        }
    }*/

   /* public class AdService {
        private AdView adView;

        public AdService(AdView adView) {
            this.adView = adView;
        }
        public void loadAd() {
            AdRequest adRequest = new AdRequest.Builder().build();
            adView.loadAd(adRequest);
        }
    } */

}