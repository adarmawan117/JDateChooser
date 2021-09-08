int waktuTerlewat = 0;
private void btnHapusEnterActionPerformed(java.awt.event.ActionEvent evt) {
    String input = txtInput.getText();
    txtOutput.setText(input.replaceAll("\n", " ").replaceAll("  ", " "));
    txtOutput.requestFocus();
    
    r.keyPress(KeyEvent.VK_CONTROL);
    
    r.keyPress(KeyEvent.VK_A);
    r.keyRelease(KeyEvent.VK_A);
    
    r.keyPress(KeyEvent.VK_C);
    r.keyRelease(KeyEvent.VK_C);
    
    r.keyRelease(KeyEvent.VK_CONTROL);
    
    txtKeterangan.setText("Text berhasil dicopy.!");
    btnHapusEnter.setEnabled(false);
    ActionListener taskPerformer = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent evt) {
            waktuTerlewat++;
            System.out.println("Waktu : "+ waktuTerlewat);
            if(waktuTerlewat == 2) {
                ((Timer)(evt.getSource())).stop();
                txtKeterangan.setText("");
                btnHapusEnter.setEnabled(true);
            }
        }
    };
    new Timer(1000, taskPerformer).start();
}
