    /**
     * byte(�ֽ�)���ݳ���ת��kb(ǧ�ֽ�)��mb(���ֽ�)
     *
     * @param bytes
     * @return
     */
    public static float bytes2Mb(long bytes) {
        BigDecimal filesize = new BigDecimal(bytes);
        BigDecimal megabyte = new BigDecimal(1024 * 1024);//1MB
        float returnValue = filesize.divide(megabyte, 2, BigDecimal.ROUND_UP).floatValue();//ǿ�ƽ�һ��������λ
        if (returnValue > 1)//����1MB
            return returnValue;//��λMB
        BigDecimal kilobyte = new BigDecimal(1024);//1KB
        returnValue = filesize.divide(kilobyte, 2, BigDecimal.ROUND_UP).floatValue();
        return returnValue;//��λKB
    }